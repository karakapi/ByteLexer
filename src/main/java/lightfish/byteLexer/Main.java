package lightfish.byteLexer;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class Main {
    static String projectPath;

    static {
        try {
            projectPath = "D:/byteLexer";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        String generated = projectPath + "/src/test/java/lightfish/byteLexer/";
        genFile(generated);
    }

    static void genFile(String generatedPath) throws Exception {
        String name = projectPath + "/src/main/java/lightfish/byteLexer/Lexer.java";
        List<String> read = Files.readAllLines(Paths.get(projectPath + "/src/main/resources/sql_tokens.txt"))
                .stream().filter((i) -> !"".equals(i)).collect(Collectors.toList());
        StringBuilder stringBuilder=new StringBuilder("package lightfish.byteLexer;public class H {    public static final int STRING_TOKEN = 1000;\n" +
                "    public static final int INT_TOKEN = 999;\n" +
                "    public static final int DOUBLE_TOKEN = 998;\n" +
                "    public static final int ID_TOKEN = 997;\n");
        for (int i = 0; i < read.size(); i++) {
            String t = read.get(i);
            stringBuilder.append( String.format("public static final int %s = %d;%n", Ascll.shiftAscll(t,false), i));
        }
        stringBuilder.append("}");
        Files.write( Paths.get(generatedPath + "H.java"), stringBuilder.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        Map<Character, List<String>> source = read.stream().map((i) -> i.trim()).filter((i) -> !"".equals(i)).distinct().collect(Collectors.groupingBy((k) -> k.charAt(0)));
        TrieTree trieTree = new TrieTree(read);
        source.values().stream().flatMap((s) -> s.stream()).forEach((i) -> trieTree.insert(i));
        //source.get('I').stream().forEach((i) -> trieTree.insert(i));
        System.out.println(trieTree.toString());
        String src = Files.readAllLines(Paths.get(name)).stream().collect(Collectors.joining("\n"));
        src = src.replaceAll(" Lexer", " NLexer");
        String body = trieTree.toString();
        Map<String, String> map = trieTree.getFunName();
        String head = map.values().stream().map((s) -> String.format("%s %s =new %s()", s, s.toLowerCase(), s)).collect(Collectors.joining(";\n")) + ";";
        System.out.println(head);
        src = src.substring(0, src.lastIndexOf("public int parse()")).concat(head).concat("\n").concat(body).concat("}");
        System.out.println(src);
        Path target = Paths.get(generatedPath + "NLexer.java");
        if (Files.exists(target)) Files.delete(target);
        Files.write(target, src.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
    }
}
