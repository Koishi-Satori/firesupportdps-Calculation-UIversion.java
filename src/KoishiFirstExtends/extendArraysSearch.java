package KoishiFirstExtends;

import java.math.BigInteger;

/**
 * Provide an interface of the method.
 * <p>There are default methods which use for circulation to search the key.</p>
 * And I strongly recommend overwrite them.
 * @see Default
 * @author KKoishi_
 * @author Yuyuko_
 * @since 2021/10/17
 * @version v1.0(base on jdk16.0.*+)
 * <p>The author's GitHub homepage:<a href="https://github.com/Koishi-Satori">rue~</a></p>
 */
interface extendArraysSearch {
    int Search(Object[] list, Object key);
    int search(int[] list, int key);
    int Search(Integer[] list,Integer key);
    int Search(Long[] list, Long key);
    int Search(String[] list,String key);
    int Search(BigInteger[] list,BigInteger key);
    int Search(Byte[] list,Byte key);
    int Search(Short[] list,Short key);
    int Search(Double[] list,Double key);
    int Search(Float[] list,Float key);
}
