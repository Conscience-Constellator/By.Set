package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Short;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.Int1$1;
import CC.$.Q$Q.Short$Int;
import CC.$.Q2$.Short_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Short<From_Typ> extends
	Get_Int_By_Short,
	Set_Q_By_Short<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	Short_Int$
{
	@Lin_Dclar void Set_Int_By_Short(short By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Int$(short By,int Valu){Set_Int_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Short_Sorc(short By,Short$Int Sorc){Set_Int_By_Short(By,Sorc.Short$Int(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Short(short By,Int1$1 Fun,int Valu)
		{Set_Int_By_Short(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Short_Sorc(short By,Int1$1 Fun,Short$Int Sorc)
			{Set_Int1$1_By_Short(By,Fun,Sorc.Short$Int(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Short(short By,Int1$1 Fun)
				{Set_Int1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Short(short By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Short(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Short_SLit(short By,Int2$1 Fun,Short$Int A,int B)
			{Set_Int2$1_By_Short(By,Fun,A.Short$Int(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Short(short By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Short_Sorc(short By,Int2$1 Fun,Short$Int A,Short$Int B)
				{Set_Int2$1_By_Short_SLit(By,Fun,A,B.Short$Int(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Short_Sorc(short By,Int2$1 Fun,Short$Int B)
					{Set_Int2$1_By_Short_Sorc(By,Fun,this,B);}
		
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Short(short By,int Valu)
	{
		int Stor=Get_Int_By_Short(By);
		Set_Int_By_Short(By,Valu);

		return Stor;
	}
}