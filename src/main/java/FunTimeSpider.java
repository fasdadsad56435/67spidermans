import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.*;

public class FunTimeSpider {

    private static final String BASE_URL = "https://funtime.su/";

    public static void main(String[] args) {
        System.out.println("🚀 FunTime Spider запущен!\n");

        try {
            String ua = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36";
            
            Document doc = Jsoup.connect(BASE_URL)
                    .userAgent(ua)
                    .timeout(15000)
                    .get();

            System.out.println("✅ Заголовок: " + doc.title());
            System.out.println("📄 Страница успешно загружена!");

            // Добавь сюда свой парсинг позже
        } catch (Exception e) {
            System.err.println("❌ Ошибка: " + e.getMessage());
        }
    }
}
