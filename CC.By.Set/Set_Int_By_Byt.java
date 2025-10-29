package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Byt;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.$.Q$Q.Byt$Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.Byt_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Byt<From_Typ> extends
	Get_Int_By_Byt,
	Set_Q_By_Byt<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	Byt_Int$
{
	@Lin_Dclar void Set_Int_By_Byt(byte By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_Int$(byte By,int Valu){Set_Int_By_Byt(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Byt_Sorc(byte By,Byt$Int Sorc){Set_Int_By_Byt(By,Sorc.Byt$Int(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Byt(byte By,Int1$1 Fun,int Valu)
		{Set_Int_By_Byt(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Byt_Sorc(byte By,Int1$1 Fun,Byt$Int Sorc)
			{Set_Int1$1_By_Byt(By,Fun,Sorc.Byt$Int(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Byt(byte By,Int1$1 Fun)
				{Set_Int1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Byt(byte By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Byt(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Byt_SLit(byte By,Int2$1 Fun,Byt$Int A,int B)
			{Set_Int2$1_By_Byt(By,Fun,A.Byt$Int(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Byt(byte By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Byt_Sorc(byte By,Int2$1 Fun,Byt$Int A,Byt$Int B)
				{Set_Int2$1_By_Byt_SLit(By,Fun,A,B.Byt$Int(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Byt_Sorc(byte By,Int2$1 Fun,Byt$Int B)
					{Set_Int2$1_By_Byt_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Byt(byte By,int Valu)
	{
		int Stor=Get_Int_By_Byt(By);
		Set_Int_By_Byt(By,Valu);

		return Stor;
	}
}