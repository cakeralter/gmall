package top.caker.gmall.common.lock;

/**
 * @author cakeralter
 * @date 2020/5/31
 */
public interface LockCostant {

    public final static String KEY = "gmall-lock-key";
    public final static long EXPIRE = 10L;
    public final static String DELETE_SCRIPT = "if redis.call('get', KEYS[1]) == ARGV[1] " +
            "then return redis.call('del', KEYS[1]) " +
            "else return 0 " +
            "end";
}
