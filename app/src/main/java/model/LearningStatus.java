package model;

public class LearningStatus {
    // Fields
    private String id;
    private String userId;
    private String courseId;
    private String contentId;
    private String status;

    // Constructor
    private LearningStatus() {}
    private LearningStatus(String id, String userId, String courseId, String contentId, String status) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.contentId = contentId;
        this.status = status;
    }

    // Named Constructor
    public static LearningStatus makeLearningStatus() {
        // named constructor
        // TODO: implement
        return new LearningStatus(null, null, null, null, null);
    }
    public static LearningStatus makeLearningStatus(String id, String userId, String courseId, String contentId, String status) {
        // named constructor
        // TODO: implement
        return new LearningStatus(id, userId, courseId, contentId, status);
    }
    // Methods
    public void setStatus(String newStatus) {
        // 출석, 지각, 결석 상태를 set
        // TODO: implement
    }

    // getter
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getContentId() {
        return contentId;
    }

    public String getStatus() {
        return status;
    }
}

