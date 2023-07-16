package org.ohx.studydecorator.documentprint.befor;

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
     * @param task
     * @param text
     */
    public static void executePrintTask(PrintTask task, String text) {
        log();
        task.print(text);
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
