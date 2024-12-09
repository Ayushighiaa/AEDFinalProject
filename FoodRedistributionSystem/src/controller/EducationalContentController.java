package controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller class to manage educational content.
 */
public class EducationalContentController {

    // Stores content with the title as the key and description as the value
    private Map<String, String> contentMap;

    

    /**
     * Adds new content.
     *
     * @param title       The title of the content.
     * @param description The description of the content.
     */
    public void addContent(String title, String description) {
        contentMap.put(title, description);
    }

    /**
     * Updates existing content.
     *
     * @param title       The title of the content to update.
     * @param description The new description of the content.
     * @return true if the content exists and was updated, false otherwise.
     */
    public boolean updateContent(String title, String description) {
        if (contentMap.containsKey(title)) {
            contentMap.put(title, description);
            return true;
        }
        return false; // Content with the given title doesn't exist
    }

    /**
     * Deletes content based on the title.
     *
     * @param title The title of the content to delete.
     * @return true if the content existed and was deleted, false otherwise.
     */
    public boolean deleteContent(String title) {
        if (contentMap.containsKey(title)) {
            contentMap.remove(title);
            return true;
        }
        return false; // Content with the given title doesn't exist
    }

    /**
     * Fetches the description of content by title.
     *
     * @param title The title of the content to fetch.
     * @return The description of the content, or null if it doesn't exist.
     */
    public String getContent(String title) {
        return contentMap.get(title);
    }

    /**
     * Fetches all content as a map.
     *
     * @return A map containing all educational content.
     */
    public Map<String, String> getAllContent() {
        return contentMap;
    }
}
