package lightfish.byteLexer;
 class QParseNode extends P{  public  int parse(){int c;{c=cc(x);if(c=='u'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){t=H.QUARTER;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='y'){t=H.QUERY;++x;return x;}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='k'){t=H.QUICK;++x;return x;}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}}