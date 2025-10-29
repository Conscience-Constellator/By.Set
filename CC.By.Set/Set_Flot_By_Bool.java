package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import CC.Util.By.Get.Get_Flot_By_Bool;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.$.Q$Q.Bool$Flot;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q2$.Bool_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Bool<From_Typ> extends
	Get_Flot_By_Bool,
	Set_Flot_By_Q<From_Typ>,
	Set_Q_By_Bool<From_Typ>,
	Bool_Flot$
{
	@Lin_Dclar void Set_Flot_By_Bool(boolean By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Flot$(boolean By,float Valu){Set_Flot_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Bool_Sorc(boolean By,Bool$Flot Sorc){Set_Flot_By_Bool(By,Sorc.Bool$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Bool(boolean By,Flot1$1 Fun,float Valu)
			{Set_Flot_By_Bool(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Bool_Sorc(boolean By,Flot1$1 Fun,Bool$Flot Sorc)
			{Set_Flot1$1_By_Bool(By,Fun,Sorc.Bool$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Bool(boolean By,Flot1$1 Fun)
				{Set_Flot1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Bool(boolean By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Bool(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Bool_SLit(boolean By,Flot2$1 Fun,Bool$Flot A,float B)
			{Set_Flot2$1_By_Bool(By,Fun,A.Bool$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Bool(boolean By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Bool_Sorc(boolean By,Flot2$1 Fun,Bool$Flot A,Bool$Flot B)
				{Set_Flot2$1_By_Bool_SLit(By,Fun,A,B.Bool$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Bool_Sorc(boolean By,Flot2$1 Fun,Bool$Flot B)
					{Set_Flot2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Bool(boolean By,float Valu)
	{
		float Stor=Get_Flot_By_Bool(By);
		Set_Flot_By_Bool(By,Valu);

		return Stor;
	}
}