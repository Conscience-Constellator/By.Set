package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Dubl;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Dubl$Bool;
import CC.$.Q2$.Dubl_Bool$;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_Dubl<From_Typ> extends
	Get_Bool_By_Dubl,
	Set_Bool_By_Q<From_Typ>,
	Set_Q_By_Dubl<From_Typ>,
	Dubl_Bool$
{
	@Lin_Dclar void Set_Bool_By_Dubl(double By,boolean Valu);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dubl_Bool$(double A,boolean B){Set_Bool_By_Dubl(A,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Dubl_Sorc(double By,Dubl$Bool Sorc){Set_Bool_By_Dubl(By,Sorc.Dubl$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Dubl(double By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Dubl(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Dubl_Sorc(double By,Bool$Bool Fun,Dubl$Bool Sorc)
			{Set_Bool1$1_By_Dubl(By,Fun,Sorc.Dubl$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Dubl(double By,Bool$Bool Fun)
				{Set_Bool1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Dubl(double By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Dubl(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Dubl_SLit(double By,Bool2$1 Fun,Dubl$Bool A,boolean B)
			{Set_Bool2$1_By_Dubl(By,Fun,A.Dubl$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Dubl(double By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Dubl_Sorc(double By,Bool2$1 Fun,Dubl$Bool A,Dubl$Bool B)
				{Set_Bool2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Dubl_Sorc(double By,Bool2$1 Fun,Dubl$Bool B)
					{Set_Bool2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Dubl(double By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Dubl(By);
		Set_Bool_By_Dubl(By,Valu);

		return Stor;
	}
}