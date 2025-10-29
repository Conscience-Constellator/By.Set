package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Flot;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Flot$Bool;
import CC.$.Q2$.Flot_Bool$;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_Flot<From_Typ> extends
	Get_Bool_By_Flot,
	Set_Bool_By_Q<From_Typ>,
	Set_Q_By_Flot<From_Typ>,
	Flot_Bool$
{
	@Lin_Dclar void Set_Bool_By_Flot(float By,boolean Valu);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flot_Bool$(float A,boolean B){Set_Bool_By_Flot(A,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Flot_Sorc(float By,Flot$Bool Sorc){Set_Bool_By_Flot(By,Sorc.Flot$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Flot(float By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Flot(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Flot_Sorc(float By,Bool$Bool Fun,Flot$Bool Sorc)
			{Set_Bool1$1_By_Flot(By,Fun,Sorc.Flot$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Flot(float By,Bool$Bool Fun)
				{Set_Bool1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Bool(float By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Flot(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Flot_SLit(float By,Bool2$1 Fun,Flot$Bool A,boolean B)
			{Set_Bool2$1_By_Bool(By,Fun,A.Flot$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Flot(float By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Flot_Sorc(float By,Bool2$1 Fun,Flot$Bool A,Flot$Bool B)
				{Set_Bool2$1_By_Flot_SLit(By,Fun,A,B.Flot$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Flot_Sorc(float By,Bool2$1 Fun,Flot$Bool B)
					{Set_Bool2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Flot(float By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Flot(By);
		Set_Bool_By_Flot(By,Valu);

		return Stor;
	}
}