package org.shahid.strategy;

import com.google.common.base.CaseFormat;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class TableNamingStrategy extends PhysicalNamingStrategyStandardImpl {

	private static final long serialVersionUID = -4836546617547661792L;
	
	public static final String TABLE_PREFIX = "TBL_";
	
	protected String getPrefix() {
		return TABLE_PREFIX;
	}
	
	@Override
	public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
			if (name.getText().contains("_")){
				return name;
			}
			else{
				return context.getIdentifierHelper().toIdentifier(
						getPrefix() + CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name.getText()));
			}
	}


	@Override
	public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
		return context.getIdentifierHelper().toIdentifier(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name.getText()));

	}
	
	@Override
	public Identifier toPhysicalSequenceName(Identifier name, JdbcEnvironment context) {
		return context.getIdentifierHelper().toIdentifier(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name.getText()));
	}

}
