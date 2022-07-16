package org.ohx.studydesignmode.iterator.bookself;

/**
 * 遍历集合的接口
 *
 * @author haoxian, ou
 * @date 2021/8/2 21:19
 */
public interface Iterator {
    /**
     * 判断是否存在下一个元素
     *
     * @return true：存在下一个元素；false：不存在下一个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return 下一个元素
     */
    Object next();
}
