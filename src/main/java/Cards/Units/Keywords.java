
package Cards.Units;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Keywords {

    @SerializedName("cover")
    private Long mCover;
    @SerializedName("pierce")
    private Long mPierce;
    @SerializedName("speeder")
    private Long mSpeeder;

    public Long getCover() {
        return mCover;
    }

    public void setCover(Long cover) {
        mCover = cover;
    }

    public Long getPierce() {
        return mPierce;
    }

    public void setPierce(Long pierce) {
        mPierce = pierce;
    }

    public Long getSpeeder() {
        return mSpeeder;
    }

    public void setSpeeder(Long speeder) {
        mSpeeder = speeder;
    }

}
