
package Cards.Upgrades;

import java.util.List;
import javax.annotation.Generated;

import Cards.Units.Keywords;
import Cards.Units.Weapon;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Upgrade {

    @SerializedName("adds_miniature")
    private Boolean mAddsMiniature;
    @SerializedName("adds_upgrade_slots")
    private AddsUpgradeSlots mAddsUpgradeSlots;
    @SerializedName("id")
    private String mId;
    @SerializedName("is_exhaustible")
    private Boolean mIsExhaustible;
    @SerializedName("is_unique")
    private Boolean mIsUnique;
    @SerializedName("keywords")
    private Keywords mKeywords;
    @SerializedName("keywords_for_unit")
    private KeywordsForUnit mKeywordsForUnit;
    @SerializedName("name")
    private String mName;
    @SerializedName("points")
    private Long mPoints;
    @SerializedName("restricted_to_unit")
    private List<RestrictedToUnit> mRestrictedToUnit;
    @SerializedName("text")
    private String mText;
    @SerializedName("type")
    private String mType;
    @SerializedName("waves")
    private List<String> mWaves;
    @SerializedName("weapon")
    private Weapon mWeapon;

    public Boolean getAddsMiniature() {
        return mAddsMiniature;
    }

    public void setAddsMiniature(Boolean addsMiniature) {
        mAddsMiniature = addsMiniature;
    }

    public AddsUpgradeSlots getAddsUpgradeSlots() {
        return mAddsUpgradeSlots;
    }

    public void setAddsUpgradeSlots(AddsUpgradeSlots addsUpgradeSlots) {
        mAddsUpgradeSlots = addsUpgradeSlots;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Boolean getIsExhaustible() {
        return mIsExhaustible;
    }

    public void setIsExhaustible(Boolean isExhaustible) {
        mIsExhaustible = isExhaustible;
    }

    public Boolean getIsUnique() {
        return mIsUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        mIsUnique = isUnique;
    }

    public Keywords getKeywords() {
        return mKeywords;
    }

    public void setKeywords(Keywords keywords) {
        mKeywords = keywords;
    }

    public KeywordsForUnit getKeywordsForUnit() {
        return mKeywordsForUnit;
    }

    public void setKeywordsForUnit(KeywordsForUnit keywordsForUnit) {
        mKeywordsForUnit = keywordsForUnit;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getPoints() {
        return mPoints;
    }

    public void setPoints(Long points) {
        mPoints = points;
    }

    public List<RestrictedToUnit> getRestrictedToUnit() {
        return mRestrictedToUnit;
    }

    public void setRestrictedToUnit(List<RestrictedToUnit> restrictedToUnit) {
        mRestrictedToUnit = restrictedToUnit;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public List<String> getWaves() {
        return mWaves;
    }

    public void setWaves(List<String> waves) {
        mWaves = waves;
    }

    public Weapon getWeapon() {
        return mWeapon;
    }

    public void setWeapon(Weapon weapon) {
        mWeapon = weapon;
    }

}
