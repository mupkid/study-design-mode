package org.ohx.studydesignmode.decorator.documentprint.befor;

/**
 * A部门的打印处理
 *
 * @author haoxian, ou
 * @date 2021/7/22 22:34
 */
public class SecretDepartment {

    public void print(String text) {
        SecretPrint task = new SecretPrint();

        // PrintServer即“文档打印系统”
        PrintServer.executePrintTask(task, text);
    }
}
