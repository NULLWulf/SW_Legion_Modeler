
package Cards.Units;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Unit {

    @SerializedName("attack_surge")
    private String mAttackSurge;
    @SerializedName("defense")
    private String mDefense;
    @SerializedName("faction")
    private String mFaction;
    @SerializedName("has_defense_surge")
    private Boolean mHasDefenseSurge;
    @SerializedName("id")
    private String mId;
    @SerializedName("is_unique")
    private Boolean mIsUnique;
    @SerializedName("keywords")
    private Keywords mKeywords;
    @SerializedName("miniatures")
    private Long mMiniatures;
    @SerializedName("name")
    private String mName;
    @SerializedName("points")
    private Long mPoints;
    @SerializedName("rank")
    private String mRank;
    @SerializedName("speed")
    private Long mSpeed;
    @SerializedName("type")
    private String mType;
    @SerializedName("upgrades")
    private Upgrades mUpgrades;
    @SerializedName("waves")
    private List<String> mWaves;
    @SerializedName("weapons")
    private List<Weapon> mWeapons;
    @SerializedName("wounds")
    private Long mWounds;

    public String getAttackSurge() {
        return mAttackSurge;
    }

    public void setAttackSurge(String attackSurge) {
        mAttackSurge = attackSurge;
    }

    public String getDefense() {
        return mDefense;
    }

    public void setDefense(String defense) {
        mDefense = defense;
    }

    public String getFaction() {
        return mFaction;
    }

    public void setFaction(String faction) {
        mFaction = faction;
    }

    public Boolean getHasDefenseSurge() {
        return mHasDefenseSurge;
    }

    public void setHasDefenseSurge(Boolean hasDefenseSurge) {
        mHasDefenseSurge = hasDefenseSurge;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
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

    public Long getMiniatures() {
        return mMiniatures;
    }

    public void setMiniatures(Long miniatures) {
        mMiniatures = miniatures;
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

    public String getRank() {
        return mRank;
    }

    public void setRank(String rank) {
        mRank = rank;
    }

    public Long getSpeed() {
        return mSpeed;
    }

    public void setSpeed(Long speed) {
        mSpeed = speed;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Upgrades getUpgrades() {
        return mUpgrades;
    }

    public void setUpgrades(Upgrades upgrades) {
        mUpgrades = upgrades;
    }

    public List<String> getWaves() {
        return mWaves;
    }

    public void setWaves(List<String> waves) {
        mWaves = waves;
    }

    public List<Weapon> getWeapons() {
        return mWeapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        mWeapons = weapons;
    }

    public Long getWounds() {
        return mWounds;
    }

    public void setWounds(Long wounds) {
        mWounds = wounds;
    }

}
