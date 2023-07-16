package org.ohx.studydecorator.documentprint.after;

/**
 * 由A部门负责维护该类
 * A部门的打印处理，注意和传统方法中的 SecretDepartment 类对比
 *
 * @author haoxian, ou
 * @date 2021/7/23 7:54
 */
public class SecretDepartment {
    /**
     * 打印任务1，对应传统方式的SecretPrint类
     *
     * @param text
     */
    public void print(String text) {
        // 使用 Decorator 模式后，打印任务不再是一个单独的SecretPrint类
        // 而是将多个打印项目聚合成一个打印任务
        PrintComponent textComponent = new TextComponent(text);

        // header 聚合了 textComponent
        PrintDecorator header = new HeaderDecorator(textComponent, "绝密");
        // footer 聚合了 header 而不是 textComponent，这样就能够嵌套执行下去
        PrintDecorator footer = new FooterDecorator(header, "本文包含绝密信息，请勿泄露");
        // watermark 聚合了 footer
        PrintDecorator watermark = new TextWaterMarkDecorator(footer, "绝密文档");

        // PrintServer 即“文档打印系统”，与传统的 PrintServer 相比
        // 这里不需要知道打印的text内容，因为已经封装到textComponent中去了
        // 注意这里传递给打印系统的是最后一个 Decorator 对象 watermark
        PrintServer.executePrintTask(watermark);
    }

    /**
     * A部门的第二个打印任务，将文本水印改为图片水印，并且不再打印页脚
     *
     * @param text
     */
    public void print2(String text) {
        // 新增打印任务，无须文档管理系统增加新的类，只要A部门自己修改打码即可
        PrintComponent textComponent = new TextComponent(text);

        // header 聚合了 textComponent
        PrintDecorator header = new HeaderDecorator(textComponent, "绝密");
        // watermark 聚合了 header
        PrintDecorator watermark = new ImgWaterMarkDecorator(header);

        PrintServer.executePrintTask(watermark);
    }
}
