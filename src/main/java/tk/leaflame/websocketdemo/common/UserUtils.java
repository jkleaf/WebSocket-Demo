package tk.leaflame.websocketdemo.common;

import org.springframework.security.core.context.SecurityContextHolder;
import tk.leaflame.websocketdemo.entity.User;

/**
 * @author leaflame
 * @date 2019/11/14 21:44
 */
public class UserUtils {

    public static String getCurrentUser(){
        return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
