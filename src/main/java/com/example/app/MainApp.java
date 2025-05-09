// package com.example.app;

// import com.example.utility.HelloUtil;

// public class MainApp {
//     public static void main(String[] args) {
//         System.out.println(HelloUtil.getMessage());
//     }
// }
package com.example.app;

import com.example.utility.HelloUtil;

public class MainApp {
    public static void main(String[] args) {
        String message = HelloUtil.getMessage();
        System.out.println(message);
        
        // Force Maven to see and use the dependency
        if (message == null) {
            throw new IllegalStateException("Utility library not found!");
        }
    }
}
