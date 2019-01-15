/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 下午2:54:19
 */
package nine.seven;

import java.util.Random;

/**
 * @author Administrator
 *
 */
public interface RandVals {
	Random RAND = new Random(47);
	int RADON_INT = RAND.nextInt(10);
	long RADON_LONG = RAND.nextLong() * 10;
	float RADON_FLOAT = RAND.nextLong() * 10;
	double RADON_DOUBLE = RAND.nextLong() * 10;
}
