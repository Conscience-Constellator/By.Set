package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Int;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.Int_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Int<From_Typ> extends
	Get_Int_By_Int,
	Set_Q_By_Int<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	Int_Int$
{
	@Lin_Dclar void Set_Int_By_Int(int By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Int$(int By,int Valu){Set_Int_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Int_Sorc(int By,Int1$1 Sorc){Set_Int_By_Int(By,Sorc.Int1$1(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Int(int By,Int1$1 Fun,int Valu)
		{Set_Int_By_Int(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Int_Sorc(int By,Int1$1 Fun,Int1$1 Sorc)
			{Set_Int1$1_By_Int(By,Fun,Sorc.Int1$1(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Int(int By,Int1$1 Fun)
				{Set_Int1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Int(int By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Int(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Int_SLit(int By,Int2$1 Fun,Int1$1 A,int B)
			{Set_Int2$1_By_Int(By,Fun,A.Int1$1(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Int_SLit(int By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Int_Sorc(int By,Int2$1 Fun,Int1$1 A,Int1$1 B)
				{Set_Int2$1_By_Int_SLit(By,Fun,A,B.Int1$1(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Int_Sorc(int By,Int2$1 Fun,Int1$1 B)
					{Set_Int2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int1$1 Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Int_By_Int(IndX,Sorc.Int1$1(IndX));}
		}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Int(int By,int Valu)
	{
		int Stor=Get_Int_By_Int(By);
		Set_Int_By_Int(By,Valu);

		return Stor;
	}
}