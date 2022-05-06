/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.records;


import cn.vertxup.workflow.domain.tables.TAssetOut;
import cn.vertxup.workflow.domain.tables.interfaces.ITAssetOut;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TAssetOutRecord extends UpdatableRecordImpl<TAssetOutRecord> implements VertxPojo, Record3<String, String, String>, ITAssetOut {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_OUT.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    @Override
    public TAssetOutRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_OUT.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_OUT</code>. 「commentOut」-
     * 出库备注
     */
    @Override
    public TAssetOutRecord setCommentOut(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_OUT</code>. 「commentOut」-
     * 出库备注
     */
    @Override
    public String getCommentOut() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_USAGE</code>.
     * 「commentUsage」- 出库使用说明
     */
    @Override
    public TAssetOutRecord setCommentUsage(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_USAGE</code>.
     * 「commentUsage」- 出库使用说明
     */
    @Override
    public String getCommentUsage() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TAssetOut.T_ASSET_OUT.KEY;
    }

    @Override
    public Field<String> field2() {
        return TAssetOut.T_ASSET_OUT.COMMENT_OUT;
    }

    @Override
    public Field<String> field3() {
        return TAssetOut.T_ASSET_OUT.COMMENT_USAGE;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getCommentOut();
    }

    @Override
    public String component3() {
        return getCommentUsage();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getCommentOut();
    }

    @Override
    public String value3() {
        return getCommentUsage();
    }

    @Override
    public TAssetOutRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TAssetOutRecord value2(String value) {
        setCommentOut(value);
        return this;
    }

    @Override
    public TAssetOutRecord value3(String value) {
        setCommentUsage(value);
        return this;
    }

    @Override
    public TAssetOutRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITAssetOut from) {
        setKey(from.getKey());
        setCommentOut(from.getCommentOut());
        setCommentUsage(from.getCommentUsage());
    }

    @Override
    public <E extends ITAssetOut> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAssetOutRecord
     */
    public TAssetOutRecord() {
        super(TAssetOut.T_ASSET_OUT);
    }

    /**
     * Create a detached, initialised TAssetOutRecord
     */
    public TAssetOutRecord(String key, String commentOut, String commentUsage) {
        super(TAssetOut.T_ASSET_OUT);

        setKey(key);
        setCommentOut(commentOut);
        setCommentUsage(commentUsage);
    }

    /**
     * Create a detached, initialised TAssetOutRecord
     */
    public TAssetOutRecord(cn.vertxup.workflow.domain.tables.pojos.TAssetOut value) {
        super(TAssetOut.T_ASSET_OUT);

        if (value != null) {
            setKey(value.getKey());
            setCommentOut(value.getCommentOut());
            setCommentUsage(value.getCommentUsage());
        }
    }

    public TAssetOutRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
