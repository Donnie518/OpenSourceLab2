import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * L2022212005_15_Test
 *
 * 测试类设计原则：
 * - 等价类划分：根据版本号是否相同、包含前导零、版本号长度不同等情况划分等价类。
 * - 边界值分析：如版本号最小长度、修订号长度、全为零的版本等边界值。
 */
public class L2022212005_15_Test {

    // 测试目的：验证两个版本号相等的情况
    // 测试用例："1.01" 和 "1.001"，忽略前导零应相等
    @Test
    public void testEqualVersions() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1.01", "1.001"));
    }

    // 测试目的：验证版本号长度不同但相等的情况
    // 测试用例："1.0" 和 "1.0.0"，应当相等
    @Test
    public void testDifferentLengthButEqual() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1.0", "1.0.0"));
    }

    // 测试目的：验证一个版本号小于另一个的情况
    // 测试用例："0.1" 和 "1.1"，应当返回 -1
    @Test
    public void testVersion1LessThanVersion2() {
        Solution solution = new Solution();
        assertEquals(-1, solution.compareVersion("0.1", "1.1"));
    }

    // 测试目的：验证版本号带有前导零的情况
    // 测试用例："1.001" 和 "1.1"，应当相等
    @Test
    public void testLeadingZeros() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1.001", "1.1"));
    }

    // 测试目的：验证一个版本号大于另一个的情况
    // 测试用例："1.2" 和 "1.1"，应当返回 1
    @Test
    public void testVersion1GreaterThanVersion2() {
        Solution solution = new Solution();
        assertEquals(1, solution.compareVersion("1.2", "1.1"));
    }
}
//使用了Junit编写Test方法 专业