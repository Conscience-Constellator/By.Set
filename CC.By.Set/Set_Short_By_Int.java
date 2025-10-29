package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Int;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Int$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Int_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_Int<From_Typ> extends
	Get_Short_By_Int,
	Set_Q_By_Int<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Int_Short$
{
	@Lin_Dclar void Set_Short_By_Int(int By,short Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Short$(int By,short Valu){Set_Short_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short_By_Int_Sorc(int By,Int$Short Sorc){Set_Short_By_Int(By,Sorc.Int$Short(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short1$1_By_Int(int By,Short1$1 Fun,short Valu)
		{Set_Short_By_Int(By,Fun.Short1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short1$1_By_Int_Sorc(int By,Short1$1 Fun,Int$Short Sorc)
			{Set_Short1$1_By_Int(By,Fun,Sorc.Int$Short(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short1$1_By_Int(int By,Short1$1 Fun)
				{Set_Short1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short2$1_By_Int(int By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Int(By,Fun.Short2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short2$1_By_Int_SLit(int By,Short2$1 Fun,Int$Short A,short B)
			{Set_Short2$1_By_Int(By,Fun,A.Int$Short(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short2$1_By_Int(int By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Short2$1_By_Int_Sorc(int By,Short2$1 Fun,Int$Short A,Int$Short B)
				{Set_Short2$1_By_Int_SLit(By,Fun,A,B.Int$Short(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Short2$1_By_Int_Sorc(int By,Short2$1 Fun,Int$Short B)
					{Set_Short2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Short Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Short_By_Int(IndX,Sorc.Int$Short(IndX));}
		}
		
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default short SGet_Short_By_Int(int By,short Valu)
	{
		short Stor=Get_Short_By_Int(By);
		Set_Short_By_Int(By,Valu);

		return Stor;
	}
}