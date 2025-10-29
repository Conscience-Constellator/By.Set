package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Bool;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q2$.Bool_Bool$;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_Bool<From_Typ> extends
	Get_Bool_By_Bool,
	Set_Bool_By_Q<From_Typ>,
	Set_Q_By_Bool<From_Typ>,
	Bool_Bool$
{
	@Lin_Dclar
	void Set_Bool_By_Bool(boolean By,boolean Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Bool$(boolean A,boolean B){Set_Bool_By_Bool(A,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Bool_Sorc(boolean By,Bool$Bool Sorc)
		{Set_Bool_By_Bool(By,Sorc.Bool$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Bool(boolean By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Bool(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Bool_Sorc(boolean By,Bool$Bool Fun,Bool$Bool Sorc)
			{Set_Bool1$1_By_Bool(By,Fun,Sorc.Bool$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Bool(boolean By,Bool$Bool Fun)
				{Set_Bool1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Bool(boolean By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Bool(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Bool_SLit(boolean By,Bool2$1 Fun,Bool$Bool A,boolean B)
			{Set_Bool2$1_By_Bool(By,Fun,A.Bool$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Bool(boolean By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Bool_Sorc(boolean By,Bool2$1 Fun,Bool$Bool A,Bool$Bool B)
				{Set_Bool2$1_By_Bool_SLit(By,Fun,A,B.Bool$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Bool_Sorc(boolean By,Bool2$1 Fun,Bool$Bool B)
					{Set_Bool2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Bool(boolean By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Bool(By);
		Set_Bool_By_Bool(By,Valu);

		return Stor;
	}
}