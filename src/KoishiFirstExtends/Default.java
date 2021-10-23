package KoishiFirstExtends;

import java.math.BigInteger;
import java.util.Objects;
/**<p>After find {@link java.util.Arrays#binarySearch(Object[], Object)} need to pre-sort the Array,this class is written.</p>
 * There are more useful and faster methods to search,and this default method only provide one of them.
 * When you are use it,you can overwrite it.
 * @see KoishiFirstExtends.extendArraysSearch
 * @author KKoishi_
 * @author Yuyuko_
 * @since The fire-support-calculator is finished and UIed.
 * @version v1.0(base on jdk16.0.*+)
 * <p>The author's GitHub homepage:<a href="https://github.com/Koishi-Satori">rue~</a></p>
 */
public abstract class Default implements extendArraysSearch{
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * If the constructor of the object provides getter method, you can use object.get[Value]().
     * @param list The object Array you need to provide.
     * @param key The object value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Object[] list, Object key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i],key)) return i;
        }
        return -1 - size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The int Array you need to provide.
     * @param key The int value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int search(int[] list, int key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (list[i] == key) return i;
        }
        return -1 - size;
    }
    /**
     * What am I doing?
     * Perhaps there are questions about why public an existed method.
     * <p>For making the code more elegant.>_<</p>
     * <p>Search the key in the list.</p>
     * @param list The Integer Array you need to provide.
     * @param key The Integer value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Integer[] list, Integer key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1 - size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The Long Array you need to provide.
     * @param key The Long value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Long[] list, Long key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1-size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The String Array you need to provide.
     * @param key The String value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(String[] list, String key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1-size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The BigInteger Array you need to provide.
     * @param key The BigInteger value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(BigInteger[] list, BigInteger key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1-size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The Byte Array you need to provide.
     * @param key The Byte value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Byte[] list, Byte key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1 - size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The Short-long Array you need to provide.
     * @param key The Short-long value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Short[] list, Short key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1 - size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The Double Array you need to provide.
     * @param key The Double value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Double[] list, Double key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1 - size;
    }
    /**
     * What am I doing?
     * <p>Search the key in the list.</p>
     * @param list The Float Array you need to provide.
     * @param key The Float value you want to search.
     * @return an integer,if key exist in the list,return the subscript of it in list.
     * <p>Yet if it doesn't exist in the list,return -1 minus the length of the list.</p>
     */
    @Override
    public int Search(Float[] list, Float key) {
        int size = list.length;
        for (int i = 0;i<size;i++) {
            if (Objects.equals(list[i], key)) return i;
        }
        return -1 - size;
    }
}