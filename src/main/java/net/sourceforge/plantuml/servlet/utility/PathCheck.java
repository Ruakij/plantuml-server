package net.sourceforge.plantuml.servlet.utility;

import java.io.File;
import java.io.IOException;

public final class PathCheck {
    private PathCheck() { }

    public static boolean isDirect(String path) {
        try {
            File file = new File(path);
            // Only allow relativ paths without special traversal (., ..)
            return file.isAbsolute() || !file.getCanonicalPath().equals(file.getAbsolutePath());
        } catch (IOException e) {
        }
        return false;
    }
}
