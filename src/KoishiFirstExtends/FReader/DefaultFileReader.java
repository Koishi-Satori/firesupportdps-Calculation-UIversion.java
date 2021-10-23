package KoishiFirstExtends.FReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**Obviously,it's a file reader and automatically return a String.
 * @author KKoishi_
 * @author Yuyuko_
 * @since 2021/10/18
 * @version 1.0(base on JDK16.0.*+)
 * <p>The author's GitHub homepage:<a href="https://github.com/Koishi-Satori">rue~</a></p>
 */
public abstract class DefaultFileReader implements FileOperation {
    /**
     * @param path a String,please key in a file path here!
     * @return a String,which read from the file.
     */
    @Override
    public String readInputString(String path) {
        StringBuilder ruaFallen = new StringBuilder();//rua Fallen_Breath
        FileReader fileReader;
        File file = new File(path);
        try {
            fileReader = new FileReader(file);
            char[] chars = new char[10];
            while (fileReader.read(chars) != -1) {
                ruaFallen.append(String.valueOf(chars));
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ruaFallen.toString();
    }
}
