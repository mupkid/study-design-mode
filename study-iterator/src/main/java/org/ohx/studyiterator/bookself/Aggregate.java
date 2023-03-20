package org.ohx.studyiterator.bookself;

/**
 * 表示集合的接口
 *
 * @author haoxian, ou
 * @date 2021/8/2 21:17
 */
public interface Aggregate {
    /**
     * 生成一个用于遍历集合的迭代器
     *
     * @return 迭代器
     */
    Iterator iterator();
}
