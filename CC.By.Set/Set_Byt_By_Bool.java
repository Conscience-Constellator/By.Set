package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Bool;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Bool$Byt;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q2$.Bool_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Bool<From_Typ> extends
	Get_Byt_By_Bool,
	Set_Q_By_Q<From_Typ>,
	Bool_Byt$
{
	@Lin_Dclar void Set_Byt_By_Bool(boolean By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Byt$(boolean By,byte Valu){Set_Byt_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Bool_Sorc(boolean By,Bool$Byt Sorc){Set_Byt_By_Bool(By,Sorc.Bool$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Bool(boolean By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Bool(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Bool_Sorc(boolean By,Byt$Byt Fun,Bool$Byt Sorc)
			{Set_Byt1$1_By_Bool(By,Fun,Sorc.Bool$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Bool(boolean By,Byt$Byt Fun)
				{Set_Byt1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Bool(boolean By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Bool(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Bool_SLit(boolean By,Byt2$1 Fun,Bool$Byt A,byte B)
			{Set_Byt2$1_By_Bool(By,Fun,A.Bool$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Bool(boolean By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Bool_Sorc(boolean By,Byt2$1 Fun,Bool$Byt A,Bool$Byt B)
				{Set_Byt2$1_By_Bool_SLit(By,Fun,A,B.Bool$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Bool_Sorc(boolean By,Byt2$1 Fun,Bool$Byt B)
					{Set_Byt2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Bool(boolean By,byte Valu)
	{
		byte Stor=Get_Byt_By_Bool(By);
		Set_Byt_By_Bool(By,Valu);

		return Stor;
	}
}