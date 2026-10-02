package dev.minime.ime;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Small offline prototype dictionary for Chinese -> English candidate annotations.
 * The lookup is intentionally exact; phrases not present simply show no annotation.
 */
final class TranslationDictionary {
    private static final Map<String, String> EN;

    static {
        Map<String, String> m = new HashMap<>();

        put(m, "开发", "development");
        put(m, "编程", "programming");
        put(m, "架构", "architecture");
        put(m, "编译", "compile");
        put(m, "语言", "language");
        put(m, "学习", "learn;study");
        put(m, "英语", "English");
        put(m, "中文", "Chinese");
        put(m, "输入法", "input method");
        put(m, "输入", "input");
        put(m, "输出", "output");
        put(m, "电脑", "computer");
        put(m, "手机", "phone");
        put(m, "键盘", "keyboard");
        put(m, "软件", "software");
        put(m, "程序", "program");
        put(m, "代码", "code");
        put(m, "文件", "file");
        put(m, "网络", "network");
        put(m, "数据", "data");
        put(m, "数据库", "database");
        put(m, "技术", "technology");
        put(m, "机器", "machine");
        put(m, "机械", "machinery");
        put(m, "模型", "model");
        put(m, "设计", "design");
        put(m, "工程", "engineering");
        put(m, "学校", "school");
        put(m, "老师", "teacher");
        put(m, "学生", "student");
        put(m, "比赛", "competition");
        put(m, "今天", "today");
        put(m, "明天", "tomorrow");
        put(m, "昨天", "yesterday");
        put(m, "现在", "now");
        put(m, "以后", "later");
        put(m, "你好", "hello");
        put(m, "谢谢", "thanks");
        put(m, "再见", "goodbye");
        put(m, "喜欢", "like");
        put(m, "需要", "need");
        put(m, "想要", "want");
        put(m, "知道", "know");
        put(m, "理解", "understand");
        put(m, "问题", "question;problem");
        put(m, "答案", "answer");
        put(m, "开始", "start;begin");
        put(m, "结束", "finish;end");
        put(m, "工作", "work");
        put(m, "时间", "time");
        put(m, "地方", "place");
        put(m, "朋友", "friend");
        put(m, "这个", "this");
        put(m, "那个", "that");
        put(m, "什么", "what");
        put(m, "怎么", "how");
        put(m, "为什么", "why");
        put(m, "可以", "can");
        put(m, "应该", "should");
        put(m, "一起", "together");
        put(m, "喝水", "drink water");
        put(m, "吃饭", "eat");
        put(m, "回家", "go home");
        put(m, "上课", "attend class");
        put(m, "下课", "class ends");

        EN = Collections.unmodifiableMap(m);
    }

    private static void put(Map<String, String> m, String zh, String en) {
        m.put(zh, en);
    }

    static String lookup(String text) {
        return EN.getOrDefault(text, "");
    }

    private TranslationDictionary() {}
}