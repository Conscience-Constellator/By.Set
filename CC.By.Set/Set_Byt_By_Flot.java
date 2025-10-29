package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Flot;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Bool$Byt;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Flot$Byt;
import CC.$.Q2$.Flot_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Flot<From_Typ> extends
	Get_Byt_By_Flot,
	Set_Short_By_Q<From_Typ>,
	Set_Q_By_Flot<From_Typ>,
	Flot_Byt$
{
	@Lin_Dclar void Set_Byt_By_Flot(float By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Flot_Byt$(float By,byte Valu){Set_Byt_By_Flot(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Flot_Sorc(float By,Flot$Byt Sorc){Set_Byt_By_Flot(By,Sorc.Flot$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Flot(float By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Flot(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Flot_Sorc(float By,Byt$Byt Fun,Flot$Byt Sorc)
			{Set_Byt1$1_By_Flot(By,Fun,Sorc.Flot$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Flot(float By,Byt$Byt Fun)
				{Set_Byt1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Flot(float By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Flot(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Flot_SLit(float By,Byt2$1 Fun,Flot$Byt A,byte B)
			{Set_Byt2$1_By_Flot(By,Fun,A.Flot$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Flot(float By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Flot_Sorc(float By,Byt2$1 Fun,Flot$Byt A,Flot$Byt B)
				{Set_Byt2$1_By_Flot_SLit(By,Fun,A,B.Flot$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Flot_Sorc(float By,Byt2$1 Fun,Flot$Byt B)
					{Set_Byt2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Flot(float By,byte Valu)
	{
		byte Stor=Get_Byt_By_Flot(By);
		Set_Byt_By_Flot(By,Valu);

		return Stor;
	}
}