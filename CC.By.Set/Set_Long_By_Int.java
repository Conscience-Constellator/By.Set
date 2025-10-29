package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Int;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.$.Q$Q.Int$Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q2$.Int_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Int<From_Typ> extends
	Get_Long_By_Int,
	Set_Q_By_Int<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Int_Long$
{
	@Lin_Dclar void Set_Long_By_Int(int By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Long$(int By,long Valu){Set_Long_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Int_Sorc(int By,Int$Long Sorc){Set_Long_By_Int(By,Sorc.Int$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Int(int By,Long1$1 Fun,long Valu)
		{Set_Long_By_Int(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Int_Sorc(int By,Long1$1 Fun,Int$Long Sorc)
			{Set_Long1$1_By_Int(By,Fun,Sorc.Int$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Int(int By,Long1$1 Fun)
				{Set_Long1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Int(int By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Int(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Int_SLit(int By,Long2$1 Fun,Int$Long A,long B)
			{Set_Long2$1_By_Int(By,Fun,A.Int$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Int(int By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Int_Sorc(int By,Long2$1 Fun,Int$Long A,Int$Long B)
				{Set_Long2$1_By_Int_SLit(By,Fun,A,B.Int$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Int_Sorc(int By,Long2$1 Fun,Int$Long B)
					{Set_Long2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Long Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Long_By_Int(IndX,Sorc.Int$Long(IndX));}
		}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Int(int By,long Valu)
	{
		long Stor=Get_Long_By_Int(By);
		Set_Long_By_Int(By,Valu);

		return Stor;
	}
}