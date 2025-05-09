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
        // Make sure HelloUtil's method is used so Maven checks the dependency
        System.out.println(HelloUtil.getMessage()); // This forces compilation
        checkUtilityLibPresence();
    }

    // Example method to throw error if the utility lib is missing
    private static void checkUtilityLibPresence() {
        try {
            HelloUtil.getMessage();  // Force checking utility-lib
        } catch (Exception e) {
            throw new IllegalStateException("utility-lib is missing or not resolved!");
        }
    }
}

