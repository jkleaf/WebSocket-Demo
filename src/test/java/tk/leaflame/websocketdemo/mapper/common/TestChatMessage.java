package tk.leaflame.websocketdemo.mapper.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.leaflame.websocketdemo.common.ChatMessage;
import tk.leaflame.websocketdemo.common.ChatMessageType;

import javax.sound.sampled.Line;

/**
 * @author leaflame
 * @date 2020/2/7 0:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestChatMessage {

    Logger logger = LoggerFactory.getLogger(TestChatMessage.class);

    @Test
    public void testChatMsg() {
        System.out.println(new ChatMessage(ChatMessageType.CHAT,"fuck you","tester666"));
    }
}
