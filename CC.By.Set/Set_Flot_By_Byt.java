package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Byt;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.$.Q$Q.Byt$Flot;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q2$.Byt_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Byt<From_Typ> extends
	Get_Flot_By_Byt,
	Set_Flot_By_Q<From_Typ>,
	Set_Q_By_Byt<From_Typ>,
	Byt_Flot$
{
	@Lin_Dclar void Set_Flot_By_Byt(byte By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_Flot$(byte By,float Valu){Set_Flot_By_Byt(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Byt_Sorc(byte By,Byt$Flot Sorc){Set_Flot_By_Byt(By,Sorc.Byt$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Byt(byte By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Byt(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Byt_Sorc(byte By,Flot1$1 Fun,Byt$Flot Sorc)
			{Set_Flot1$1_By_Byt(By,Fun,Sorc.Byt$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Byt(byte By,Flot1$1 Fun)
				{Set_Flot1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Byt(byte By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Byt(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Byt_SLit(byte By,Flot2$1 Fun,Byt$Flot A,float B)
			{Set_Flot2$1_By_Byt(By,Fun,A.Byt$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Byt(byte By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Byt_Sorc(byte By,Flot2$1 Fun,Byt$Flot A,Byt$Flot B)
				{Set_Flot2$1_By_Byt_SLit(By,Fun,A,B.Byt$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Byt_Sorc(byte By,Flot2$1 Fun,Byt$Flot B)
					{Set_Flot2$1_By_Byt_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Byt(byte By,float Valu)
	{
		float Stor=Get_Flot_By_Byt(By);
		Set_Flot_By_Byt(By,Valu);

		return Stor;
	}
}