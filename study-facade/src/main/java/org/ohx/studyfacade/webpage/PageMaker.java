package org.ohx.studyfacade.webpage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author mudkip
 * @date 2023/7/16
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String filename) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + " 欢迎来到 " + username + " 的主页。");
            writer.paragraph(" 等着你的邮件哦！ ");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddr + "（" + username + "）");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
