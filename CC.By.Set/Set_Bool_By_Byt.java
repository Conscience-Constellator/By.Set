package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Byt;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Byt$Bool;
import CC.$.Q2$.Byt_Bool$;
import CC.$.QQ$Q.Bool2$1;

public interface Set_Bool_By_Byt<From_Typ> extends
		Get_Bool_By_Byt,
		Set_Bool_By_Q<From_Typ>,
		Set_Q_By_Byt<From_Typ>,
		Byt_Bool$
{
	@Lin_Dclar
	void Set_Bool_By_Byt(byte By,boolean Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_Bool$(byte A,boolean B)
		{Set_Bool_By_Byt(A,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Byt_Sorc(byte By,Byt$Bool Sorc)
		{Set_Bool_By_Byt(By,Sorc.Byt$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Byt(byte By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Byt(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Bool_Sorc(byte By,Bool$Bool Fun,Byt$Bool Sorc)
			{Set_Bool1$1_By_Byt(By,Fun,Sorc.Byt$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Bool(byte By,Bool$Bool Fun)
				{Set_Bool1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Bool(byte By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Byt(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Bool_SLit(byte By,Bool2$1 Fun,Byt$Bool A,boolean B)
			{Set_Bool2$1_By_Bool(By,Fun,A.Byt$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Bool(byte By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Bool_Sorc(byte By,Bool2$1 Fun,Byt$Bool A,Byt$Bool B)
				{Set_Bool2$1_By_Bool_SLit(By,Fun,A,B.Byt$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Byt_Sorc(byte By,Bool2$1 Fun,Byt$Bool B)
					{Set_Bool2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Byt(byte By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Byt(By);
		Set_Bool_By_Byt(By,Valu);

		return Stor;
	}
}