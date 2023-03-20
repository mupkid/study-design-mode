package org.ohx.studylod.webcrawler.before;

/**
 * @author mudkip
 * @date 2023/3/19
 */
public class Document {
    private Html html;
    private String url;

    public Document(String url) {
        this.url = url;
        HtmlDownloader downloader = new HtmlDownloader();
        this.html = downloader.downloadHtml(url);
    }
}
