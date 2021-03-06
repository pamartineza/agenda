package greachconf.vm;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class Speaker implements Comparable<Speaker> {

    @Nonnull
    private String uid;

    @Nonnull
    private String name;

    @Nullable
    private List<String> bio;

    @Nullable
    private String twitter;

    @Nullable
    private String image;

    public Speaker() {}

    @Nonnull
    public String getUid() {
        return uid;
    }

    public void setUid(@Nonnull String uid) {
        this.uid = uid;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    @Nullable
    public List<String> getBio() {
        return bio;
    }

    public void setBio(@Nullable List<String> bio) {
        this.bio = bio;
    }

    @Nullable
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(@Nullable String twitter) {
        this.twitter = twitter;
    }

    @Nullable
    public String getImage() {
        return image;
    }

    public void setImage(@Nullable String image) {
        this.image = image;
    }

    @Override
    public int compareTo(Speaker o) {
        return getName().compareTo(o.getName());
    }
}
