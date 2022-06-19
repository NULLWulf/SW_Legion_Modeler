
package Cards;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CommandCard {

    @SerializedName("activated")
    private String mActivated;
    @SerializedName("faction")
    private String mFaction;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("pips")
    private Long mPips;
    @SerializedName("required")
    private List<Object> mRequired;
    @SerializedName("text")
    private String mText;
    @SerializedName("waves")
    private List<String> mWaves;

    public String getActivated() {
        return mActivated;
    }

    public void setActivated(String activated) {
        mActivated = activated;
    }

    public String getFaction() {
        return mFaction;
    }

    public void setFaction(String faction) {
        mFaction = faction;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getPips() {
        return mPips;
    }

    public void setPips(Long pips) {
        mPips = pips;
    }

    public List<Object> getRequired() {
        return mRequired;
    }

    public void setRequired(List<Object> required) {
        mRequired = required;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public List<String> getWaves() {
        return mWaves;
    }

    public void setWaves(List<String> waves) {
        mWaves = waves;
    }

}
