package org.example.utils;

import net.lightbody.bmp.core.har.Har;
import org.assertj.core.api.Assertions;

import java.util.concurrent.atomic.AtomicInteger;

public class HarParse {

    public HarParse(Har har) {

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AtomicInteger i = new AtomicInteger();
        har.getLog().getEntries().forEach(entry -> {
            String url = entry.getRequest().getUrl();

            // это проверка на код 0. Возникает только когда хар не успевает собираться. если появляется - добавить задержки перед кликами
            if (entry.getResponse().getStatus() == 0 && url.contains("schema")) {
                System.out.println(entry.getResponse().getStatus() + entry.getResponse().getStatusText() + entry.getResponse().getContent().getText() + "++" + entry.getRequest().getUrl() + "***" + entry.getRequest().getPostData().getText());
            }

            if (url.contains("schema")) {
                i.getAndIncrement();
                String status = String.valueOf(entry.getResponse().getStatus());
                System.out.println(i + " URL: " + url + " status " + entry.getResponse().getStatus());
                Assertions.assertThat(status).satisfiesAnyOf(
                        s -> Assertions.assertThat(status).contains("200"),
                        s -> Assertions.assertThat(status).contains("204"),
                        s -> Assertions.assertThat(status).contains("302"),
                        s -> Assertions.assertThat(status).contains("301")
                );
            }
        });

        har.getLog().getEntries().forEach(e -> {
                    String url = e.getRequest().getUrl();
                    if (url.contains("schema")) {
                        String content = String.valueOf(e.getResponse().getContent().getText());
                        if (content == null) {
                            System.out.println(e.getResponse().getStatus() + "  " + e.getRequest().getUrl() + e.getRequest().getQueryString());
                        }
                    }
                }
        );

    }
}


