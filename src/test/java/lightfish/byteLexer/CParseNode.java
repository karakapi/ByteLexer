package lightfish.byteLexer;
 class CParseNode extends P{  public  int parse(){int c;switch (cc(x)){
case 'l' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='r'){t=H.CLEAR;++x;return x;}endId();return x;}}endId();return x;}}if(c=='a'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){t=H.CLASS_ORIGIN;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){t=H.CLIENT;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='e'){t=H.CLOSE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}
case 'i' :{{c=cc(x);if(c=='p'){{c=cc(x);if(c=='h'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){t=H.CIPHER;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'h' :{{c=cc(x);if(c=='a'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='l'){t=H.CHANNEL;++x;return x;}endId();return x;}}endId();return x;}}if(c=='g'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){t=H.CHANGED;++x;return x;}return x;}}endId();return x;}}endId();return x;}}if(c=='r'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){t=H.CHARACTER;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='t'){t=H.CHARSET;++x;return x;}endId();return x;}}endId();return x;}}return x;}}if(c=='i'){{c=cc(x);if(c=='n'){t=H.CHAIN;++x;return x;}endId();return x;}}endId();return x;}}if(c=='e'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='k'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='m'){t=H.CHECKSUM;++x;return x;}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'u' :{{c=cc(x);if(c=='b'){{c=cc(x);if(c=='e'){t=H.CUBE;++x;return x;}endId();return x;}}if(c=='r'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){t=H.CURDATE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){t=H.CURTIME;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){t=H.CURSOR_NAME;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){t=H.CURRENT_USER;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='d'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){t=H.CURRENT_DATE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='p'){t=H.CURRENT_TIMESTAMP;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'r' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){t=H.CREATE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='s'){t=H.CROSS;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}
case 'a' :{{c=cc(x);if(c=='l'){{c=cc(x);if(c=='l'){t=H.CALL;++x;return x;}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){t=H.CATALOG_NAME;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='l'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='t'){t=H.CATLET;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='c'){{c=cc(x);if(c=='h'){{c=cc(x);if(c=='e'){t=H.CACHE;++x;return x;}endId();return x;}}endId();return x;}}if(c=='s'){{c=cc(x);if(c=='e'){t=H.CASE;++x;return x;}if(c=='t'){t=H.CAST;++x;return x;}if(c=='c'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){t=H.CASCADED;++x;return x;}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'p' :{{c=cc(x);if(c=='u'){t=H.CPU;++x;return x;}endId();return x;}}
case 'o' :{switch (cc(x)){
case 'n' :{switch (cc(x)){
case 'n' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){t=H.CONNECTION;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'f' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='g'){t=H.CONFIG;++x;return x;}endId();return x;}}endId();return x;}}
case 'v' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='t'){t=H.CONVERT;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}
case 'd' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){t=H.CONDITION;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 't' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='x'){{c=cc(x);if(c=='t'){t=H.CONTEXT;++x;return x;}endId();return x;}}endId();return x;}}if(c=='r'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='s'){t=H.CONTRIBUTORS;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='a'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='s'){t=H.CONTAINS;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='e'){t=H.CONTINUE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'c' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){t=H.CONCURRENT;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 's' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){t=H.CONSISTENT;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){t=H.CONSTRAINT_NAME;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='c'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='g'){t=H.CONSTRAINT_CATALOG;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='h'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='a'){t=H.CONSTRAINT_SCHEMA;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
default:endId();return x;
}}
case 'm' :{{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){t=H.COMMENT;++x;return x;}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){t=H.COMMITTED;++x;return x;}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}if(c=='p'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){t=H.COMPRESSED;++x;return x;}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){t=H.COMPRESSION;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='a'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='t'){t=H.COMPACT;++x;return x;}endId();return x;}}endId();return x;}}if(c=='l'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){t=H.COMPLETION;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'u' :{{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){t=H.COUNT;++x;return x;}endId();return x;}}endId();return x;}}
case 'd' :{{c=cc(x);if(c=='e'){t=H.CODE;++x;return x;}endId();return x;}}
case 'l' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){t=H.COLUMN_FORMAT;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='n'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){t=H.COLUMN_NAME;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){t=H.COLUMNS;++x;return x;}return x;}}endId();return x;}}endId();return x;}}if(c=='l'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){t=H.COLLATE;++x;return x;}if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){t=H.COLLATION;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'a' :{{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='e'){t=H.COALESCE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
default:endId();return x;
}}
default:endId();return x;
}}}