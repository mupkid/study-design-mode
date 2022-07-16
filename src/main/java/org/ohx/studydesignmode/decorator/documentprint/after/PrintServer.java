package org.ohx.studydesignmode.decorator.documentprint.after;

/**
 * 文档打印系统
 *
 * @author haoxian, ou
 * @date 2021/7/22 21:46
 */
public class PrintServer {
    /**
     * 执行打印任务
     *
     * @param component 打印任务
     */
    public static void executePrintTask(PrintComponent component) {
        log();
        component.print();
        audit();
    }

    /**
     * 记录日志
     */
    private static void log() {
    }

    /**
     * 记录审计相关信息
     */
    private static void audit() {
    }
}
