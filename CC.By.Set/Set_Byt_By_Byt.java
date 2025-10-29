package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Byt;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q2$.Byt_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Byt<From_Typ> extends
	Get_Byt_By_Byt,
	Set_Q_By_Q<From_Typ>,
	Byt_Byt$
{
	@Lin_Dclar void Set_Byt_By_Byt(byte By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_Byt$(byte By,byte Valu){Set_Byt_By_Byt(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Byt_Sorc(byte By,Byt$Byt Sorc){Set_Byt_By_Byt(By,Sorc.Byt$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Byt(byte By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Byt(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Byt_Sorc(byte By,Byt$Byt Fun,Byt$Byt Sorc)
			{Set_Byt1$1_By_Byt(By,Fun,Sorc.Byt$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Byt(byte By,Byt$Byt Fun)
				{Set_Byt1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Bool(byte By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Byt(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Byt_SLit(byte By,Byt2$1 Fun,Byt$Byt A,byte B)
			{Set_Byt2$1_By_Bool(By,Fun,A.Byt$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Bool(byte By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Byt_Sorc(byte By,Byt2$1 Fun,Byt$Byt A,Byt$Byt B)
				{Set_Byt2$1_By_Byt_SLit(By,Fun,A,B.Byt$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Byt_Sorc(byte By,Byt2$1 Fun,Byt$Byt B)
					{Set_Byt2$1_By_Byt_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Byt(byte By,byte Valu)
	{
		byte Stor=Get_Byt_By_Byt(By);
		Set_Byt_By_Byt(By,Valu);

		return Stor;
	}
}