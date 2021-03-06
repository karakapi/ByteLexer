package lightfish.byteLexer;


import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lexer extends P {
    public Lexer() {


    }


    public static void main(String[] args) throws Exception {
        Lexer lexer = new Lexer();
        URI uri = Lexer.class.getResource(".").toURI();
        Files.lines(Paths.get(uri).getParent().getParent().resolve("test.txt"))
                .map((s) -> s.toLowerCase().trim().concat(" ").getBytes(StandardCharsets.US_ASCII))
                .forEach((s) -> {
                    lexer.init(s, 0);
                    while (lexer.hasMore) {
                        lexer.parse();
                        switch (lexer.getTokenType()) {
                            case H.FROM: {
                                while (lexer.hasMore) {
                                    lexer.parse();
                                    int type = lexer.getTokenType();
                                    if (type == H.IDENTIFIED) {
                                        System.out.println(lexer.readString());
                                    } else if (type == H.COMMA) {
                                        continue;
                                    }
                                }
                            }
                            default:
                                continue;
                        }
                        //  System.out.println(lexer.getTokenType());
                    }
                });
    }


    public Lexer(byte[] r) {
        init(r, 0);
    }

    public int parse() {
        jumpPassSpace();
        this.start = x;
        int c = 0;
        if (!hasMore) return x;
//        switch (reader[x]){
//            case 'a' :{x=AParseNode.parse(x);t=AParseNode.t;}
//            case 'b' :{x=BParseNode.parse(x);t=BParseNode.t;}
//            case 'c' :{x=CParseNode.parse(x);t=CParseNode.t;}
//            case 'd' :{x=DParseNode.parse(x);t=DParseNode.t;}
//            case 'e' :{x=EParseNode.parse(x);t=EParseNode.t;}
//            case 'f' :{x=FParseNode.parse(x);t=FParseNode.t;}
//            case 'g' :{x=GParseNode.parse(x);t=GParseNode.t;}
//            case 'h' :{x=HParseNode.parse(x);t=HParseNode.t;}
//            case 'i' :{x=IParseNode.parse(x);t=IParseNode.t;}
//            case 'j' :{x=JParseNode.parse(x);t=JParseNode.t;}
//            case 'k' :{x=KParseNode.parse(x);t=KParseNode.t;}
//            case 'l' :{x=LParseNode.parse(x);t=LParseNode.t;}
//            case 'm' :{x=MParseNode.parse(x);t=MParseNode.t;}
//            case 'n' :{x=NParseNode.parse(x);t=NParseNode.t;}
//            case 'o' :{x=OParseNode.parse(x);t=OParseNode.t;}
//            case 'p' :{x=PParseNode.parse(x);t=PParseNode.t;}
//            case 'q' :{x=QParseNode.parse(x);t=QParseNode.t;}
//            case 'r' :{x=RParseNode.parse(x);t=RParseNode.t;}
//            case 's' :{x=SParseNode.parse(x);t=SParseNode.t;}
//            case 't' :{x=TParseNode.parse(x);t=TParseNode.t;}
//            case 'u' :{x=UParseNode.parse(x);t=UParseNode.t;}
//            case 'v' :{x=VParseNode.parse(x);t=VParseNode.t;}
//            case 'w' :{x=WParseNode.parse(x);t=WParseNode.t;}
//            case 'x' :{x=XParseNode.parse(x);t=XParseNode.t;}
//            case 'y' :{x=YParseNode.parse(x);t=YParseNode.t;}
//            case 'z' :{x=ZParseNode.parse(x);t=ZParseNode.t;}
//            default:id();return;
//        }
        return x;
    }
}