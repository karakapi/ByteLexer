package lightfish.byteLexer;
 class VParseNode extends P{  public  int parse(){int c;{c=cc(x);if(c=='a'){{c=cc(x);if(c=='r'){switch (cc(x)){
case 'c' :{{c=cc(x);if(c=='h'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){t=H.VARCHARACTER;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'b' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='y'){t=H.VARBINARY;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'i' :{{c=cc(x);if(c=='a'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){t=H.VARIABLES;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='n'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='e'){t=H.VARIANCE;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'y' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='g'){t=H.VARYING;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}
case '_' :{{c=cc(x);if(c=='p'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='p'){t=H.VAR_POP;++x;return x;}endId();return x;}}endId();return x;}}if(c=='s'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='p'){t=H.VAR_SAMP;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
default:endId();return x;
}}if(c=='l'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){t=H.VALIDATION;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='u'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){t=H.VALUES;++x;return x;}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='l'){t=H.VIRTUAL;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='e'){{c=cc(x);if(c=='w'){t=H.VIEW;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}}