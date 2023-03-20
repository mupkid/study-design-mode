package org.ohx.studylod.webcrawler.before;

/**
 * @author mudkip
 * @date 2023/3/19
 */
public class HtmlDownloader {
    private NetworkTransporter transporter;

    public Html downloadHtml(String url) {
        Byte[] rawHtml = transporter.send(new HtmlRequest(url));
        return new Html(rawHtml);
    }
}
