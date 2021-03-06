/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 723026534;

    /**
     * The reference instance of <code>information_schema.table_constraints</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_type</code>.
     */
    public final TableField<Record, String> CONSTRAINT_TYPE = createField(DSL.name("constraint_type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public final TableField<Record, String> IS_DEFERRABLE = createField(DSL.name("is_deferrable"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public final TableField<Record, String> INITIALLY_DEFERRED = createField(DSL.name("initially_deferred"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.table_constraints.enforced</code>.
     */
    public final TableField<Record, String> ENFORCED = createField(DSL.name("enforced"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints() {
        this(DSL.name("table_constraints"), null);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints(String alias) {
        this(DSL.name(alias), TABLE_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints(Name alias) {
        this(alias, TABLE_CONSTRAINTS);
    }

    private TableConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public <O extends Record> TableConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TABLE_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TableConstraints as(String alias) {
        return new TableConstraints(DSL.name(alias), this);
    }

    @Override
    public TableConstraints as(Name alias) {
        return new TableConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(String name) {
        return new TableConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(Name name) {
        return new TableConstraints(name, null);
    }
}
