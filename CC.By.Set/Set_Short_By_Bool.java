package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Bool;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Bool$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Bool_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_Bool<From_Typ> extends
	Get_Short_By_Bool,
	Set_Q_By_Bool<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Bool_Short$
{
	@Lin_Dclar void Set_Short_By_Bool(boolean By,short Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Short$(boolean By,short Valu){Set_Short_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short_By_Bool_Sorc(boolean By,Bool$Short Sorc){Set_Short_By_Bool(By,Sorc.Bool$Short(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short1$1_By_Bool(boolean By,Short1$1 Fun,short Valu)
		{Set_Short_By_Bool(By,Fun.Short1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short1$1_By_Bool_Sorc(boolean By,Short1$1 Fun,Bool$Short Sorc)
			{Set_Short1$1_By_Bool(By,Fun,Sorc.Bool$Short(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short1$1_By_Bool(boolean By,Short1$1 Fun)
				{Set_Short1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short2$1_By_Bool(boolean By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Bool(By,Fun.Short2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short2$1_By_Bool_SLit(boolean By,Short2$1 Fun,Bool$Short A,short B)
			{Set_Short2$1_By_Bool(By,Fun,A.Bool$Short(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short2$1_By_Bool(boolean By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Short2$1_By_Bool_Sorc(boolean By,Short2$1 Fun,Bool$Short A,Bool$Short B)
				{Set_Short2$1_By_Bool_SLit(By,Fun,A,B.Bool$Short(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Short2$1_By_Bool_Sorc(boolean By,Short2$1 Fun,Bool$Short B)
					{Set_Short2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default short SGet_Short_By_Bool(boolean By,short Valu)
	{
		short Stor=Get_Short_By_Bool(By);
		Set_Short_By_Bool(By,Valu);

		return Stor;
	}
}