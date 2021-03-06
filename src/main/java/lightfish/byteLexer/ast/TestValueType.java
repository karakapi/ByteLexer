
package lightfish.byteLexer.ast;

public final class TestValueType {
    final ByteStore byteStore;

    public TestValueType(ByteStore b) {
        byteStore = b;
    }
/**
 * static const field
 *
 *
 */
public static final int BYTES_OFFSET=0;
public static final int SHORTS_OFFSET=1;
public static final int CHARS_OFFSET=3;
public static final int INTS_OFFSET=5;
public static final int LONGS_OFFSET=9;
public static final int FLOATS_OFFSET=17;
public static final int DOUBLES_OFFSET=21;
public static final int VALUES_OFFSET=29;
public static final int RIGHTS_OFFSET=33;
public static final int LEFTS_OFFSET=37;


/**
 * static getter setter
 */

public  byte getByte(int thisAddress){return byteStore.getByte(thisAddress+BYTES_OFFSET);}
public  short getShort(int thisAddress){return byteStore.getShort(thisAddress+SHORTS_OFFSET);}
public  char getChar(int thisAddress){return byteStore.getChar(thisAddress+CHARS_OFFSET);}
public  int getInt(int thisAddress){return byteStore.getInt(thisAddress+INTS_OFFSET);}
public  long getLong(int thisAddress){return byteStore.getLong(thisAddress+LONGS_OFFSET);}
public  float getFloat(int thisAddress){return byteStore.getFloat(thisAddress+FLOATS_OFFSET);}
public  double getDouble(int thisAddress){return byteStore.getDouble(thisAddress+DOUBLES_OFFSET);}
public  int getValue(int thisAddress){return byteStore.getInt(thisAddress+VALUES_OFFSET);}
public  int getRight(int thisAddress){return byteStore.getAddress(thisAddress+RIGHTS_OFFSET);}
public  int getLeft(int thisAddress){return byteStore.getAddress(thisAddress+LEFTS_OFFSET);}

public  void setByte(int thisAddress,byte value) {byteStore.setByte(thisAddress+BYTES_OFFSET,value);}
public  void setShort(int thisAddress,short value) {byteStore.setShort(thisAddress+SHORTS_OFFSET,value);}
public  void setChar(int thisAddress,char value) {byteStore.setChar(thisAddress+CHARS_OFFSET,value);}
public  void setInt(int thisAddress,int value) {byteStore.setInt(thisAddress+INTS_OFFSET,value);}
public  void setLong(int thisAddress,long value) {byteStore.setLong(thisAddress+LONGS_OFFSET,value);}
public  void setFloat(int thisAddress,float value) {byteStore.setFloat(thisAddress+FLOATS_OFFSET,value);}
public  void setDouble(int thisAddress,double value) {byteStore.setDouble(thisAddress+DOUBLES_OFFSET,value);}
public  void setValue(int thisAddress,int value) {byteStore.setInt(thisAddress+VALUES_OFFSET,value);}
public  void setRight(int thisAddress,int value) {byteStore.setAddress(thisAddress+RIGHTS_OFFSET,value);}
public  void setLeft(int thisAddress,int value) {byteStore.setAddress(thisAddress+LEFTS_OFFSET,value);}


public static final int SIZE=41;

/**
 * static getAlloc
 */
public  int getAllocRightIfNull(int thisAddress) {return byteStore.getRefIfNull(thisAddress+RIGHTS_OFFSET,TestValueType.SIZE);}
public  int getAllocLeftIfNull(int thisAddress) {return byteStore.getRefIfNull(thisAddress+LEFTS_OFFSET,TestValueType.SIZE);}
public  int getAllocRight(int thisAddress) {return byteStore.getRef(thisAddress+RIGHTS_OFFSET,TestValueType.SIZE);}
    public  int getAllocLeft(int thisAddress) {return byteStore.getRef(thisAddress+LEFTS_OFFSET,TestValueType.SIZE);}

}
