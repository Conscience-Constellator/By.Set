package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Flot;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Flot$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Flot_Short$;
import CC.$.QQ$Q.Short2$1;

public interface Set_Short_By_Flot<From_Typ> extends
		Get_Short_By_Flot,
		Set_Q_By_Flot<From_Typ>,
		Set_Short_By_Q<From_Typ>,
		Flot_Short$
{
	@Lin_Dclar
	void Set_Short_By_Flot(float By,short Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Flot_Short$(float By,short Valu){Set_Short_By_Flot(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short_By_Flot_Sorc(float By,Flot$Short Sorc){Set_Short_By_Flot(By,Sorc.Flot$Short(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short1$1_By_Flot(float By,Short1$1 Fun,short Valu)
		{Set_Short_By_Flot(By,Fun.Short1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Short1$1_By_Flot_Sorc(float By,Short1$1 Fun,Flot$Short Sorc)
			{Set_Short1$1_By_Flot(By,Fun,Sorc.Flot$Short(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Short1$1_By_Flot(float By,Short1$1 Fun)
				{Set_Short1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short2$1_By_Flot(float By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Flot(By,Fun.Short2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Short2$1_By_Flot_SLit(float By,Short2$1 Fun,Flot$Short A,short B)
			{Set_Short2$1_By_Flot(By,Fun,A.Flot$Short(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Short2$1_By_Flot(float By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Short2$1_By_Flot_Sorc(float By,Short2$1 Fun,Flot$Short A,Flot$Short B)
				{Set_Short2$1_By_Flot_SLit(By,Fun,A,B.Flot$Short(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Short2$1_By_Flot_Sorc(float By,Short2$1 Fun,Flot$Short B)
					{Set_Short2$1_By_Flot_Sorc(By,Fun,this,B);}
		
	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default short SGet_Short_By_Flot(float By,short Valu)
	{
		short Stor=Get_Short_By_Flot(By);
		Set_Short_By_Flot(By,Valu);

		return Stor;
	}
}