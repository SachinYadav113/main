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
        String message = HelloUtil.getMessagess();
        System.out.println(message);

        // Force use of the class to ensure Maven cannot ignore the dependency
        if (message == null) {
            throw new IllegalStateException("Failed to load utility-lib!");
        }

        // Also access a dummy static method to trigger linkage (optional)
        ensureUtilityLoaded();
    }

    private static void ensureUtilityLoaded() {
        // Access HelloUtil class again to force compile-time dependency
        String test = HelloUtil.getMessagess().toLowerCase();
        if (test.isEmpty()) {
            throw new RuntimeException("utility-lib did not work as expected.");
        }
    }
}


